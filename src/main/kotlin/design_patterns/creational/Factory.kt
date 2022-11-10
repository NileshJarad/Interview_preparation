package design_patterns.creational

enum class PlansEnum {
    Domestic,
    Commercial,
    Institutional
}

fun main() {
    val planFactory = PlanFactory()
    val institutionalPlan = planFactory.getPlan(PlansEnum.Institutional)
    val commercialPlan = planFactory.getPlan(PlansEnum.Commercial)
    val domesticPlan = planFactory.getPlan(PlansEnum.Domestic)
    println()
    println("Institutional Plan rate = ${institutionalPlan?.getRate()}")
    println("Commercial Plan rate = ${commercialPlan?.getRate()}")
    println("Domestic Plan rate = ${domesticPlan?.getRate()}")
}

class PlanFactory {
    fun getPlan(plan: PlansEnum): Plan? {
        return when (plan) {
            PlansEnum.Domestic -> DomesticPlan()
            PlansEnum.Commercial -> CommercialPlan()
            PlansEnum.Institutional -> InstitutionalPlan()
            else -> null
        }
    }
}

abstract class Plan {
    private var rate: Float = 0.0f
    abstract fun getRate(): Float
}

class DomesticPlan : Plan() {
    override fun getRate(): Float {
        return 200f
    }
}

class CommercialPlan : Plan() {
    override fun getRate(): Float {
        return 400f
    }
}

class InstitutionalPlan : Plan() {
    override fun getRate(): Float {
        return 600f
    }
}