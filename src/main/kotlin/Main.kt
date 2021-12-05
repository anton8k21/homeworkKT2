fun main(args: Array<String>) {
    var likes = 0
    while (likes < 120) {
        likes += 3
        if (likes % 10 == 1 && likes !== 11 && likes % 100 !== 11) {
            println("Понравилось $likes человеку")
        } else println("Понравилось $likes людям")
    }
}