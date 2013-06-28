@Category(Vehicle) class FlyingAbility {
    def fly() { "${name}: fly!" }
}

@Category(Vehicle) class DivingAbility {
    def dive() { "${name}: dive!" }
}

interface Vehicle {
    String getName()
}

@Mixin(FlyingAbility)
class Plane implements Vehicle {
    String getName() { "Concorde" }
}

@Mixin([DivingAbility, FlyingAbility])
class JamesBondVehicle implements Vehicle {
    String getName() { "James Bond's vehicle" }
}

assert new Plane().fly() == "Concorde: fly!"
assert new JamesBondVehicle().fly() == "James Bond's vehicle: fly!"
assert new JamesBondVehicle().dive() == "James Bond's vehicle: dive!"