module ghicorp.service.impl {
    requires defcorp.service.api;
    provides com.defcorp.service.api.ServiceInterface with com.ghicorp.service.impl.ConcreteService;
}
