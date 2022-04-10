package ua.yaremenko.songratingsystem.exception;

public class ArtistAlreadyExistsException extends Exception {
    public ArtistAlreadyExistsException(String message) {
        super(message);
    }
}
