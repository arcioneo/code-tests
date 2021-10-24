package beans;

import java.util.List;

public class Installer {
	
	private String packageName;
    private List<Installer> dependencies;
    
    public Installer() {
		super();
	}

	public Installer(String packageName, List<Installer> dependencies) {
		super();
		this.packageName = packageName;
		this.dependencies = dependencies;
	}

	public void install() {
    	System.out.println("installing " + this.packageName);
    }

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<Installer> getDependencies() {
		return dependencies;
	}

	public void setDependencies(List<Installer> dependencies) {
		this.dependencies = dependencies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		return prime * result + ((packageName == null) ? 0 : packageName.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Installer other = (Installer) obj;
		
		if (packageName == null) {
			if (other.packageName != null)
				return false;
		} else if (!packageName.equals(other.packageName))
			return false;
		return true;
	}
	
	
	
    
    
    

}
