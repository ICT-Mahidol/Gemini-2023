

function checkUserId() {
    if (localStorage.getItem("userid")==0) {
        location.replace("/");
    }
    if (localStorage.getItem("role")=="observer") {
        location.replace("/observer");
    }
    console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;


async function logout() {
    localStorage.setItem("check_login", false);
    localStorage.setItem("userid", 0);
    location.replace("/");
}