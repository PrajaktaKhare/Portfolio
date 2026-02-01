//logo animation 
const logo = document.querySelector('.logo-img');

if (!sessionStorage.getItem('logoShown')) {
  logo.style.animation = 'swirlIn 2.5s ease-out forwards';
  sessionStorage.setItem('logoShown', 'true');
} else {
  logo.style.animation = 'none';
  logo.style.opacity = '1';
  logo.style.transform = 'scale(1) rotate(0deg)';
}
console.log("logo.js loaded =====================================" );