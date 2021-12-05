import com.squareup.kotlinpoet.FunSpec


private var resultModel: ResultModel? = null

fun main(args: Array<String>) {

    FileParser.apply {
        val stringJson : String = getResJson()
        resultModel = parseMyParams(stringJson)
    }

    CodeGenerator.generate()

}




object CodeGenerator {

    fun generate(){
        val main = FunSpec.builder("main")
            .addCode("""
                |var total = 0
                |for (i in 0 until 10) {
                |    total += i
                |}
                |""".trimMargin())
            .build()

        println("code gen >> $main")
    }

}