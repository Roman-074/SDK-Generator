import generate.ModelGenerator
import parse.FileParser
import parse.ResultModel


private var resultModel: ResultModel? = null

fun main(args: Array<String>) {

    FileParser.apply {
        val stringJson: String = getResJson()
        resultModel = parseMyParams(stringJson)
    }

    ModelGenerator().restGetModel()

}