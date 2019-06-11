$(document).ready(function () {
    M.AutoInit();
    $('.sidenav').sidenav();
    $('input.autocomplete').autocomplete({
        data: {
            "Apple": null,
            "Microsoft": null,
            "Google": 'https://placehold.it/250x250'
        }
    });
});




