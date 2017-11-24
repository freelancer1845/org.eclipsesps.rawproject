package org.eclipsesps.spsmodel.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.eclipsesps.spsmodel.AbstractIOField;
import org.eclipsesps.spsmodel.IORegistryService;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true)
public class IORegistryServiceImpl implements IORegistryService {

  private Map<String, AbstractIOField<?>> registry = new HashMap<>();

  public IORegistryServiceImpl() {}

  @Override
  public <T> void registerIOField(String id, AbstractIOField<T> field) {
    registry.put(id, field);
  }

  @Override
  public void deregisterIOField(String id) {
    registry.remove(id);
  }

  @Override
  public Map<String, AbstractIOField<?>> getRegistry() {
    return Collections.unmodifiableMap(registry);
  }

  @Override
  public <T> void changeIOFieldId(String oldId, String newId) {
    AbstractIOField<?> field = registry.get(oldId);
    if (field == null) {
      throw new IllegalStateException("There was no field with id: " + oldId);
    }
    registry.remove(oldId);
    registry.put(newId, field);
  }

}
