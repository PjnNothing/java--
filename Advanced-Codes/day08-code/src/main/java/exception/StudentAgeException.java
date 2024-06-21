package exception;

import domain.Student;

public class StudentAgeException extends RuntimeException{
    public StudentAgeException() {
    }

    public StudentAgeException(String message) {
        super(message);
    }



}
