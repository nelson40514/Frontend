$(document).ready(function() {
    $('.modify').click(function() {
        console.log('click')
        $(this).parent().siblings().each(function() {
            let data = $(this).html();
            $(this).before(`<input>${data}</input>`);
            $(this).remove();
        })
    })
    $('.confirm').click(function() {

    })
})