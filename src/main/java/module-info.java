module cpw.mods.bootstraplauncher {
    uses java.util.function.Consumer;
    requires java.base;
    requires cpw.mods.securejarhandler;
    requires jdk.unsupported;

    exports cpw.mods.bootstraplauncher;
}