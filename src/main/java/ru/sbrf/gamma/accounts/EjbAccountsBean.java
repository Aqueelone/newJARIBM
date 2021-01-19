package ru.sbrf.gamma.accounts;

import ru.sbrf.gamma.accounts.arguments.RuSbrfGammaAccountsEjbAccounts;
import ru.sbrf.gamma.accounts.arguments.SPX_SAVEACCARECVArg;
import ru.sbrf.gamma.accounts.arguments.SP_READRECORD_ALLArg;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import java.io.ByteArrayOutputStream;

/**
 * Session Bean implementation class EjbAccountsBean
 */
@Stateless
@Remote(EjbAccounts.class)
@Local(EjbAccountsLocal.class)
@TransactionManagement
public class EjbAccountsBean extends RuSbrfGammaAccountsEjbAccounts implements EjbAccounts, EjbAccountsLocal{

    /**
     * Default constructor. 
     */
    public EjbAccountsBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public ByteArrayOutputStream SP_READRECORD_ALL(SP_READRECORD_ALLArg argClass) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ByteArrayOutputStream SPX_SAVEACCARECV(SPX_SAVEACCARECVArg argClass) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] SP_READRECORD_ALL(byte[] XMLContainer) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] SPX_SAVEACCARECV(byte[] XMLContainer) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
