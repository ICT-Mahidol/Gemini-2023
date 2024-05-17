document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('plan-form');
    form.addEventListener('submit', function(event) {
    const user = JSON.parse(localStorage.getItem('user'));
    if (user && user.fullName) {
    const creatorInput = document.createElement('input');
    creatorInput.type = 'hidden';
    creatorInput.name = 'creator';
    creatorInput.value = user.fullName;
    form.appendChild(creatorInput);
} else {
    alert('User not found. Please log in again.');
    event.preventDefault();
}
});
});





