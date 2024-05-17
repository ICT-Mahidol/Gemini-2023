  function checkUserId() {
    if (localStorage.getItem("userid")==0) {
      location.replace("/");
    }
    if (localStorage.getItem("permission")==1) {
      location.replace("/dashboard");
    }
    console.log(localStorage.getItem("userid"));
  }

  window.onload = checkUserId;


async function logout() {
  localStorage.setItem("check_login", false);
  localStorage.setItem("userid", 0);
  location.replace("/");
}
