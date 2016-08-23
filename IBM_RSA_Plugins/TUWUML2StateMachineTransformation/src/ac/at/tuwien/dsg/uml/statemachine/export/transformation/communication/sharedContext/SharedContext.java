package ac.at.tuwien.dsg.uml.statemachine.export.transformation.communication.sharedContext;

public interface SharedContext {
	public Object getProperty(Object key);
	public boolean hasProperty(Object key);
	public void setProperty(Object key, Object value);
}
