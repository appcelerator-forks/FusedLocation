package ca.underlabs.fusedlocation;

import org.appcelerator.kroll.KrollExternalModule;

public class FusedlocationBootstrap
implements KrollExternalModule {
    public void bootstrap() {
        this.nativeBootstrap();
    }

    private native void nativeBootstrap();
}

