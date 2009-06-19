package net.vidageek.flux.concept;

final public class User {

    public User(final String name, final String password) {
        if (!valid()) {
            throw new FluxValidationException();
        }
    }

    private boolean valid() {
        // TODO Auto-generated method stub
        return false;
    }

}
