package org.eclipsesps.spsmodel;

import java.util.Map;

public interface IORegistryService {

  public <T> void registerIOField(String id, AbstractIOField<T> field);

  public <T> void changeIOFieldId(String oldId, String newId);

  public void deregisterIOField(String id);

  public Map<String, AbstractIOField<?>> getRegistry();

}
