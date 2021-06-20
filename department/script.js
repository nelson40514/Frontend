$(document).ready(function() {
    flag = 0
    $('.modify').click(modify)
    $('.confirm').click(function() {
        $(this).parent().parent().before('<tr><td><button class="modify">修改</button></td></tr>')
        $(this).parent().siblings().each(function() {
            let data = $(this).children().first().val()
            $(this).parent().prev().append(`<td>${data}</td>`)
        })
        $(this).parent().parent().prev().children().first().children().first().click(modify)
    })
})

let modify = function() {
    if (flag == 0) {
        $(this).html('儲存')
        $(this).parent().siblings().each(function() {
            let data = $(this).html()
            $(this).html(`<input value="${data}"></input>`)
        })
        flag = 1
    } else {
        $(this).html('修改')
        $(this).parent().siblings().each(function() {
            let data = $(this).children().first().val()
            $(this).html(data)
        })
        flag = 0
    }
}