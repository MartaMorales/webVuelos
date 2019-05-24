$(document).ready(function(){
    M.AutoInit();
    $('.carousel.carousel-slider').carousel({
        fullWidth: true,
        indicators: true
    });
});

$(document).ready(function(){
    $('input.autocomplete').autocomplete({
        data: {
            "Apple": null,
            "Microsoft": null,
            "Google": 'https://placehold.it/250x250'
        },
    });
});



