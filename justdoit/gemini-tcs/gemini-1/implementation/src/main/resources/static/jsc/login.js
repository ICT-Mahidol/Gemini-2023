function checkUserId() {
    if (localStorage.getItem("check_login")) {
        localStorage.setItem("userid", 0);
    }
    console.log(localStorage.getItem("userid"));
}

    window.onload = checkUserId;

async function login(event) {

    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    try {
        const loginResponse = await fetch(`http://localhost:8080/login?username=${username}&password=${password}`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        });

        if (!loginResponse.ok) {
            throw new Error('Login request failed with status ' + loginResponse.status);
        }

        const res = await loginResponse.json();

        if (res === 0) {
            document.getElementById("loginalert").innerHTML = "incorrect password";
            document.getElementById("loginalert").style.display = "block";
        } else {
            localStorage.setItem("check_login", true);
            localStorage.setItem("userid", res);

            const permsResponse = await fetch(`http://localhost:8080/getperms?id=${res}`);
            if (!permsResponse.ok) {
                throw new Error(permsResponse.status);
            }
            const permission = await permsResponse.json();

            if (permission === 1) {
                localStorage.setItem("permission", 1);
                location.replace("dashboard");
            } else {
                localStorage.setItem("permission", 2);
                location.replace("dashboard");
            }
        }
    } catch (error) {
        console.error('An error occurred:', error);
        document.getElementById("loginalert").innerHTML = "Login failed: " + error.message;
        document.getElementById("loginalert").style.display = "block";
    }
}

async function register(event) {


    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let accountname = document.getElementById("accountname").value;
    let permission = document.getElementById("permission").value;

    const data = {
        userUsername: username,
        userPassword: password,
        userAccountName: accountname,
        userPermission: permission
    };

    try {
        const adduserResponse = await fetch(`http://localhost:8080/adduser`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            },
            body: JSON.stringify(data)
        });

        if (!adduserResponse.ok) {
            throw new Error(adduserResponse.status);
        }

        const res = await adduserResponse.json();

    } catch (error) {
        console.error('An error occurred:', error);
        document.getElementById("loginalert").innerHTML = error.message;
    }

    document.getElementById("loginalert").style.display = "block";
}

function logout() {
    localStorage.setItem("check_login", false);
    localStorage.setItem("userid", 0);
    location.replace("Login.html");
}
