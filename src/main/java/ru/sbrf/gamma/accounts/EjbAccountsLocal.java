package ru.sbrf.gamma.accounts;

import ru.sbrf.gamma.accounts.arguments.*;

public interface EjbAccountsLocal {
    public java.io.ByteArrayOutputStream SP_READRECORD_ALL(SP_READRECORD_ALLArg argClass) throws Exception;
    public java.io.ByteArrayOutputStream SPX_SAVEACCARECV(SPX_SAVEACCARECVArg argClass) throws Exception;
}
