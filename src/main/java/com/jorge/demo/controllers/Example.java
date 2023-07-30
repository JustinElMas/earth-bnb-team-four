 ///* inyeccion de dependencias */
 //   private final PuestoServicio puestoServicio;
//
 //   public PuestoController(PuestoServicio puestoServicio) {
 //       this.puestoServicio = puestoServicio;
 //   }
//
 //   @GetMapping("")
 //   public String puestos(Model model) {
//
 //       List<Puesto> puestos = puestoServicio.findAll();
//
 //       model.addAttribute("puestos", puestos);
 //       return "puestos";
//
 //       /* Blindado */
 //       /* Puesto puesto = puestoServicio.findById(1L); */
//
 //   }
//
 //   @PostMapping
 //   public String guardar(
 //       @RequestParam("name")String name,
 //       @RequestParam("code") String code
 //   ) {
 //       try {
 //           /* CREAR OBJETO */
 //           int codigo = Integer.parseInt(code);
 //           Puesto puesto = new Puesto();
 //           puesto.setCodigo(codigo);
 //           puesto.setName(name);
 //           
 //           /* GUARDAR OBJETO */
//
 //           puestoServicio.save(puesto);
//
 //           /* SERÍA BUENO TOMAR UN CURSITO O CLASES SOBRE LOS TRY CATCH */
 //       } catch (IllegalArgumentException error) {
 //           
 //       }
 //       return "redirect:/puestos";
 //   }
 //   
    