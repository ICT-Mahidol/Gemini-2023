const testButton = document.getElementById('start-test');
const submitButton = document.getElementById('submit');
const testLoadingMessage = document.getElementById('testLoadingMessage');


testButton.addEventListener('click', () => {
    const selectedPlanRadio = document.querySelector('input[name="selectedPlan"]:checked');
    if (selectedPlanRadio) {
        const planNo = selectedPlanRadio.value;
        console.log(planNo)
        testLoadingMessage.style.display = 'block';
        fetch('/test/' + planNo, {
            method: 'POST'
        })
            .then(response => {
                testLoadingMessage.style.display = 'none';
                alert('Science Plan Tested!');
            })
            .catch(error => {
                console.error('Error submitting test:', error);
                alert('Error submitting test. See browser console.');
            });
    } else {
        alert('Please select a Science Plan first.');
    }
});

submitButton.addEventListener('click', () => {
    const selectedPlanRadio = document.querySelector('input[name="selectedPlan"]:checked');
    if (selectedPlanRadio) {
        const planNo = selectedPlanRadio.value;
        const user = JSON.parse(localStorage.getItem('user'));
        const fullName = user ? user.fullName : '';

        fetch('/submit/' + planNo, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ submitter: fullName })
        })
            .then(response => {
                if (response.ok) {
                    alert('Science Plan submitted successfully!');
                } else {
                    alert('Submission failed. See server logs.');
                }
            })
            .catch(error => {
                console.error('Error during submission:', error);
                alert('Error during submission. Check console for details.');
            });
    } else {
        alert('Please select a Science Plan first.');
    }
});




