import spock.lang.*

class SupportInternationalisationSpec extends Specification {
  def actionwords = Actionwords.newInstance()




  @Unroll("Messages are based on language #hiptestUid")
  def "Messages are based on language"() {
    // Tags: priority:medium


    when:
    actionwords.iStartTheCoffeeMachineUsingLanguageLang(language)
    then:
    actionwords.messageMessageShouldBeDisplayed(readyMessage)

    where:
    language | readyMessage | hiptestUid
    "en" | "Ready" | "uid:"
    "fr" | "Pret" | "uid:"
  }
  def "No messages are displayed when machine is shut down"() {
    // Tags: priority:medium


    given:
    actionwords.theCoffeeMachineIsStarted()
    when:
    actionwords.iShutdownTheCoffeeMachine()
    then:
    actionwords.messageMessageShouldBeDisplayed("")
  }
}