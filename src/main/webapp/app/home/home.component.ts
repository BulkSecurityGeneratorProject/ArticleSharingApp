import {Component} from '@angular/core';


@Component({
    selector: 'jhi-home',
    templateUrl: './home.component.html',
    styleUrls: ['home.scss']
})
export class HomeComponent {


    closeCookies() {
        (document.querySelector('#cookies-div') as HTMLElement).style.visibility = 'hidden';
    }
}
