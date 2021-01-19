package ru.sbrf.gamma.accounts;

public interface EjbAccounts {
    public byte[] SP_READRECORD_ALL(byte[] XMLContainer) throws Exception;
    public byte[] SPX_SAVEACCARECV(byte[] XMLContainer) throws Exception;
}
