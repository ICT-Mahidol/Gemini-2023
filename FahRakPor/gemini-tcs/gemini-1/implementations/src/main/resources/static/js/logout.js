document.getElementById('logout').addEventListener('click', function(event) {
    event.preventDefault();

    localStorage.removeItem('user');

    window.location.href = '/';
});