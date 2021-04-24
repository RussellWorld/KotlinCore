package core


class Country(var info: Map<String, Any>) {
    operator fun <T> get(key: String): T? {
        return info[key] as T?
    }
}


fun main() {
    val france = Country(mapOf("Name" to "France", "Population" to 66_991_000))
    val name: String? = france["Name"]
    //name is "France"
    val population: Int? = france["Population"]
    //population is 66991000

}
