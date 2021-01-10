/*global $, document, window, setTimeout, navigator, console, location*/
$(document).ready(function () {

    'use strict';

    var usernameError = true,
        emailError    = true,
        passwordError = true,
        passConfirm   = true;
		/*villeError = true;
		adresseError = true;
		telError = true;
		preonmError = true;*/

    // Detect browser for css purpose
    if (navigator.userAgent.toLowerCase().indexOf('firefox') > -1) {
        $('.form form label').addClass('fontSwitch');
    }

    // Label effect
    $('input').focus(function () {

        $(this).siblings('label').addClass('active');
    });

    // Form validation
    $('input').blur(function () {

        // User Name
        if ($(this).hasClass('nom')) {
            if ($(this).val().length === 0) {
                $(this).siblings('span.error').text('Entrez votre nom!').fadeIn().parent('.form-group').addClass('hasError');
                usernameError = true;
            } else if ($(this).val().length > 1 && $(this).val().length <= 3) {
                $(this).siblings('span.error').text('Entrez au moins 4 caracteres!').fadeIn().parent('.form-group').addClass('hasError');
                usernameError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                usernameError = false;
            }
        }
		
		 // prenom
        if ($(this).hasClass('prenom')) {
            if ($(this).val().length === 0) {
                $(this).siblings('span.error').text('Entrez votre prenom!').fadeIn().parent('.form-group').addClass('hasError');
                prenomError = true;
            } else if ($(this).val().length > 1 && $(this).val().length <= 1) {
                $(this).siblings('span.error').text('Entrez au moins 2 caracteres!').fadeIn().parent('.form-group').addClass('hasError');
                prenomError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                prenomError = false;
            }
        }
		 // Adresse
        if ($(this).hasClass('adresse')) {
            if ($(this).val().length === 0) {
                $(this).siblings('span.error').text('Entrez votre Adresse!').fadeIn().parent('.form-group').addClass('hasError');
                adresseError = true;
            } else if ($(this).val().length > 1 && $(this).val().length <= 1) {
                $(this).siblings('span.error').text('Entrez au moins 2 caracteres!').fadeIn().parent('.form-group').addClass('hasError');
                adresseError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                adrresseError = false;
            }
        }

		 // Ville
        if ($(this).hasClass('ville')) {
            if ($(this).val().length === 0) {
                $(this).siblings('span.error').text('Entrez votre ville!').fadeIn().parent('.form-group').addClass('hasError');
                villeError = true;
            } else if ($(this).val().length > 1 && $(this).val().length <= 1) {
                $(this).siblings('span.error').text('Entrez au moins 2 caracteres!').fadeIn().parent('.form-group').addClass('hasError');
                villeError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                villeError = false;
            }
        }

        // Email
        if ($(this).hasClass('email')) {
            if ($(this).val().length == '') {
                $(this).siblings('span.error').text('Entrez votre email!').fadeIn().parent('.form-group').addClass('hasError');
                emailError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                emailError = false;
            }
        }
	 // tel
        if ($(this).hasClass('tel')) {
            if ($(this).val().length === 0) {
                $(this).siblings('span.error').text('Entrez votre telephone!').fadeIn().parent('.form-group').addClass('hasError');
                telError = true;
            } else if ($(this).val().length > 1 && $(this).val().length <= 1) {
                $(this).siblings('span.error').text('Entrez au moins 2 caracteres!').fadeIn().parent('.form-group').addClass('hasError');
                telError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                telError = false;
            }
        }

        // PassWord
        if ($(this).hasClass('password')) {
            if ($(this).val().length < 3) {
                $(this).siblings('span.error').text('Entrez au moins 3 caracteres!').fadeIn().parent('.form-group').addClass('hasError');
                passwordError = true;
            } else {
                $(this).siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
                passwordError = false;
            }
        }

        // PassWord confirmation
        if ($('.password').val() !== $('.passConfirm').val()) {
            $('.passConfirm').siblings('.error').text('Saisir le meme mot de passe!').fadeIn().parent('.form-group').addClass('hasError');
            passConfirm = false;
        } else {
            $('.passConfirm').siblings('.error').text('').fadeOut().parent('.form-group').removeClass('hasError');
            passConfirm = false;
        }

        // label effect
        if ($(this).val().length > 0) {
            $(this).siblings('label').addClass('active');
        } else {
            $(this).siblings('label').removeClass('active');
        }
    });


    // form switch
    $('a.switch').click(function (e) {
        $(this).toggleClass('active');
        e.preventDefault();

        if ($('a.switch').hasClass('active')) {
            $(this).parents('.form-peice').addClass('switched').siblings('.form-peice').removeClass('switched');
        } else {
            $(this).parents('.form-peice').removeClass('switched').siblings('.form-peice').addClass('switched');
        }
    });


    // Form submit
   /* $('form.signup-form').submit(function (event) {
        event.preventDefault();

        if (usernameError == true || emailError == true || passwordError == true || passConfirm == true) {
            $('.nom, .email, .password, .passConfirm').blur();
        } else {
            $('.signup, .login').addClass('switched');

            setTimeout(function () { $('.signup, .login').hide(); }, 700);
            setTimeout(function () { $('.brand').addClass('active'); }, 300);
            setTimeout(function () { $('.heading').addClass('active'); }, 600);
            setTimeout(function () { $('.success-msg p').addClass('active'); }, 900);
            setTimeout(function () { $('.success-msg a').addClass('active'); }, 1050);
            setTimeout(function () { $('.form').hide(); }, 700);
        }
    });*/

    // Reload page
    $('a.profile').on('click', function () {
        /* pour recharger la meme page quand on click sur "votre profil",
		 sinon voir css pour changer le href de la foncion profile: location.reload(true);*/
    });


});