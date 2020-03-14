class Allergies(private val score: Int) {

    fun getList(): List<Allergen> {

        return (score % 256).toBinaryString().reversed().mapIndexed { index, char ->
            if (char == '1') Allergen.values()[index] else null }.filterNotNull()
    }

    fun isAllergicTo(allergen: Allergen): Boolean {
        return allergen in getList()
    }

    private fun Int.toBinaryString(): String {
        return Integer.toBinaryString(this)
    }
}
