package ua.yaremenko.songratingsystem.exception;

public class SongAlreadyExistsException extends Exception{
    public SongAlreadyExistsException(String message) {
        super(message);
    }
}
