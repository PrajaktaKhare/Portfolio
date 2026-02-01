document.addEventListener('DOMContentLoaded', function () {
    const buttons = document.querySelectorAll('.expand-btn');

    buttons.forEach(button => {
        button.addEventListener('click', function () {
            const desc = this.previousElementSibling; // project-description div
            desc.classList.toggle('show');           // toggle show class
            this.textContent = desc.classList.contains('show') ? 'Hide Details' : 'View Details';
        });
    });
});
