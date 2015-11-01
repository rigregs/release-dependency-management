package com.opnitech.release.services.service.impl;

import com.opnitech.release.services.service.base.Foo1LocalServiceBaseImpl;

/**
 * The implementation of the foo1 local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.opnitech.release.services.service.Foo1LocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.opnitech.release.services.service.base.Foo1LocalServiceBaseImpl
 * @see com.opnitech.release.services.service.Foo1LocalServiceUtil
 */
public class Foo1LocalServiceImpl extends Foo1LocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.opnitech.release.services.service.Foo1LocalServiceUtil} to access the foo1 local service.
     */
}
