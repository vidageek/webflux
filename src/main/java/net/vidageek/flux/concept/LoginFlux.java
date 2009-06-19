package net.vidageek.flux.concept;

@Flux
final public class LoginFlux {

    public void login(final Navigator nav) {
        User user = nav.atLoginPage();
        putUserInSession(user);
        nav.homePage();
    }

    private void putUserInSession(final User user) {
        // TODO Auto-generated method stub

    }

}
