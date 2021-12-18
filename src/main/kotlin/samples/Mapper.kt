package samples

class Mapper {

    private var output : String? = null

    fun mapModel(input_value : String) : String? {
        return when(transform(input_value)){
            "error" -> {
                "error_value"
            }
            "output" -> {
                output
            }
            else -> {
                null
            }
        }
    }

    private fun transform(value : String) : String {
        output = "$value example"
        return if (output == null)
            "error"
        else
            "output"
    }

}