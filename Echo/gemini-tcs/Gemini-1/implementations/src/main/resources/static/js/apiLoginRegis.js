function checkUserId() {
    if (localStorage.getItem("check_login")) {
        localStorage.setItem("userid", 0);
    }
    console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;

// login
async function login(username, password) {
    event.preventDefault();
    const res = await (await fetch(`http://localhost:8080/login?username=${username}&password=${password}`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
        }
    })).json();
    if (res == 0) {
        alert("Invalid username or password")
        setTimeout(() => {
            window.location.reload();
        }, 500);
    } else {
        console.log(res);
        const role = await (await fetch(`http://localhost:8080/getRole?id=${res}`, {
            method: 'GET',
            headers: {
                'Content-Type': 'application/json',
                'Accept': 'application/json'
            }
        })).json();
        console.log("Role received from server:", role);
        localStorage.setItem("check_login", true)
        localStorage.setItem("userid", res);
        if (role.role === 'Astronomer') {
            localStorage.setItem("role", 'Astronomer');
            console.log(localStorage.getItem("userid"));
            console.log(localStorage.getItem("role"));
            window.location.href = "http://localhost:8080/astronomer";
            // location.replace("http://localhost:8080/astronomer");
        } else if (role.role === 'ScienceObserver') {
            localStorage.setItem("role", 'Observer');
            console.log(localStorage.getItem("userid"));
            console.log(localStorage.getItem("role"));
            window.location.href = "http://localhost:8080/observer";
            // location.replace("observer");
        }
        // else {
        //     alert("Unknown role: " + role);
        // }
    }
}

// register
async function register() {
    event.preventDefault();

    const regname = document.getElementById('regname').value;
    const regrole = document.getElementById('regrole').value;
    const firstname = document.getElementById('firstname').value;
    const lastname = document.getElementById('lastname').value;
    const regpass = document.getElementById('regpass').value;

    // Declare the data object
    let data = {
        username: regname,
        password: regpass,
        firstname: firstname,
        lastname: lastname,
        role: regrole
    };

    if (regrole === "Astronomer") {
        const reginstitution = document.getElementById('reginstitution').value;
        const regacademicDegree = document.getElementById('regacademicDegree').value;
        data = {...data, institution: reginstitution, academicDegree: regacademicDegree};
    } else {
        const regacademicDegree = document.getElementById('regacademicDegree').value;
        const regemploymentDate = document.getElementById('regemploymentDate').value;
        const regsalary = document.getElementById('regsalary').value;
        data = {...data, academicDegree: regacademicDegree, employmentDate: regemploymentDate, salary: regsalary};
    }

    // Send the data to the server
    const res = await (await fetch(`http://localhost:8080/register`, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'Accept': 'application/json'
        },
        body: JSON.stringify(data)
    })).json();

    if (res === 0) {
        alert("Registration failed.");
    } else {
        alert("Registration successful.");
        setTimeout(function () {
            window.location.href = "http://localhost:8080/";
        }, 500);
    }
}

