$(document).ready(function() {
    flag = 0
    $('.modify').click(function() {
        if (flag == 0) {
            $(this).parent().siblings().each(function() {
                let data = $(this).html()
                $(this).html(`<input value="${data}"></input>`)
            })
            flag = 1
        } else {
            $(this).parent().siblings().each(function() {
                let data = $(this).children().first().val()
                $(this).html(data)
            })
            flag = 0
        }

    })
    $('.confirm').click(function() {

    })
})