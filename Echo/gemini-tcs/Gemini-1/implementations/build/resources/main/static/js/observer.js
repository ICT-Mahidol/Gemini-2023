function checkUserId() {
    if (localStorage.getItem("userid")==0) {
        location.replace("/");
    }
    if (localStorage.getItem("role")=="Astronomer") {
        location.replace("/astronomer");
    }
    console.log(localStorage.getItem("userid"));
}

window.onload = checkUserId;