data class Destination(val name: String, val description: String)

class TravelApp {
    private val destinations = mutableListOf<Destination>()

    fun addDestination(destination: Destination) {
        destinations.add(destination)
    }

    fun displayDestinations() {
        println("Available Destinations:")
        for ((index, destination) in destinations.withIndex()) {
            println("${index + 1}. ${destination.name}")
            println("   ${destination.description}")
            println()
        }
    }
}

fun main() {
    val travelApp = TravelApp()

    val destination1 = Destination("Paris", "The city of love and lights.")
    val destination2 = Destination("Rome", "Explore ancient ruins and indulge in delicious Italian cuisine.")
    val destination3 = Destination("Tokyo", "Experience vibrant city life, technology, and delicious street food.")

    travelApp.addDestination(destination1)
    travelApp.addDestination(destination2)
    travelApp.addDestination(destination3)

    travelApp.displayDestinations()
}
