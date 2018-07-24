class Actionwords {
  def iStartTheCoffeeMachineUsingLanguageLang(lang = "en") {
    // TODO: Implement action: "Start the coffee machine using language ${lang}"

    throw new UnsupportedOperationException()
  }

  def iShutdownTheCoffeeMachine() {
    // TODO: Implement action: "Shutdown coffee machine"

    throw new UnsupportedOperationException()
  }

  def messageMessageShouldBeDisplayed(message = "") {
    // TODO: Implement result: "Displayed message is \"${message}\""

    throw new UnsupportedOperationException()
  }

  def coffeeShouldBeServed() {
    // TODO: Implement result: "Coffee is served :)"

    throw new UnsupportedOperationException()
  }

  def coffeeShouldNotBeServed() {
    // TODO: Implement result: "No coffee is served :("

    throw new UnsupportedOperationException()
  }

  def iTakeACoffee() {
    // TODO: Implement action: "Take a coffee"

    throw new UnsupportedOperationException()
  }

  def iEmptyTheCoffeeGrounds() {
    // TODO: Implement action: "Empty coffee grounds"

    throw new UnsupportedOperationException()
  }

  def iFillTheBeansTank() {
    // TODO: Implement action: "Fill beans"

    throw new UnsupportedOperationException()
  }

  def iFillTheWaterTank() {
    // TODO: Implement action: "Fill water tank"

    throw new UnsupportedOperationException()
  }

  def iTakeCoffeeNumberCoffees(coffeeNumber = 10) {
  }

  def theCoffeeMachineIsStarted() {
    iStartTheCoffeeMachineUsingLanguageLang("en")
  }

  def iHandleEverythingExceptTheWaterTank() {
    iHandleCoffeeGrounds()
    iHandleBeans()
  }

  def iHandleWaterTank() {
  }

  def iHandleBeans() {
  }

  def iHandleCoffeeGrounds() {
  }

  def iHandleEverythingExceptTheBeans() {
    iHandleWaterTank()
    iHandleCoffeeGrounds()
  }

  def iHandleEverythingExceptTheGrounds() {
    iHandleWaterTank()
    iHandleBeans()
  }

  def displayedMessageIs(freeText = "") {
    messageMessageShouldBeDisplayed(freeText)
  }

  def iSwitchToSettingsMode() {
  }

  def settingsShouldBe(datatable = "||") {
  }
}