import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListarSocioComponent } from './listar-socio/listar-socio.component';
import { CrearSocioComponent } from './crear-socio/crear-socio.component';


const routes: Routes = [
  {path: '', redirectTo: 'customer', pathMatch:'full'},
  {path: 'listarSocio',component:ListarSocioComponent},
  {path: 'registrarSocio',component:CrearSocioComponent},

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
