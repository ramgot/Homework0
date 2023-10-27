fun main() {
    val inputString: String = readln()
    var words: List<String> = inputString.split(" ")
    var lenInput: Int = words.size
    var exist = false
    var i = 0
    while (i < lenInput) {
        if (words[i][0] == 'a' && words[i].length > 3) {
            if (!exist) {
                exist = true
            }
            i += 1
        }
        else {
            words = words.filter {it != words[i]}
            lenInput--
        }
    }
    if (exist) {
        println(words)
    }
    else {
        println("Слов на 'а' больше 3 символов не найдено")
    }
}