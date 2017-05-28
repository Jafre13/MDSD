package dk.sdu.mdsd.ann.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

public class AnnImportURIGlobalScopeProvider extends ImportUriGlobalScopeProvider{

	
	public static final URI lib_uri = URI.createURI("platform/:plugin");
	@Override
    protected LinkedHashSet<URI> getImportedUris(Resource resource)
    {
        LinkedHashSet<URI> importedURIs = super.getImportedUris(resource);
        importedURIs.add(lib_uri);
        return importedURIs;
    }
	
}
