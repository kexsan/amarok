package by.training.spring.exception;

/**
 * @author Tsimafei_Shchytkavets
 */
public class DbRuntimeException extends RuntimeException
{
    public DbRuntimeException(String message)
    {
        super(message);
    }
}
