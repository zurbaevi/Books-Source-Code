package chapter3.ex5_3_MultilineTriplequotedStrings

val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
}
