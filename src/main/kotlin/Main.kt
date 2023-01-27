class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        "Chocolate chip",
        false,
        false,
        1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {

    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }

    val totalPrice = cookies.fold(0.0) { total, cookie ->
        total + cookie.price
    }

    val total = cookies.map {
        it.price
    }.reduce {acc, price -> acc + price}

    val sum = cookies.map { cookie ->  cookie.price}.sum()

    val sumOf = cookies.sumOf { cookie -> cookie.price }


    println("Total price: $${totalPrice}")
    println("Total price: $${total}")
    println("Total price: $${sum}")
    println("Total price: $${sumOf}")
}