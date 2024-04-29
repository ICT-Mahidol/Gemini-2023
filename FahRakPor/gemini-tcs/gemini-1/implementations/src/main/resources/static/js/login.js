document.getElementById('login-form').addEventListener('submit', function(event) {
    event.preventDefault();
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    fetch('/login', {
        method: 'POST',
        headers: {'Content-Type': 'application/x-www-form-urlencoded'},
        body: `username=${encodeURIComponent(username)}&password=${encodeURIComponent(password)}`
    })
        .then(response => {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('Invalid username or password!');
            }
        })
        .then(data => {
            localStorage.setItem('user', JSON.stringify(data));
            window.location.href='/home';
        })
        .catch(error => {
            console.error('Error:', error);
            alert(error.message);
        });
});
