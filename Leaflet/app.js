var mymap = L.map('mapid').setView([62, 22], 13);

L.tileLayer('https://api.mapbox.com/styles/v1/{id}/tiles/{z}/{x}/{y}?access_token={accessToken}', {
    attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
    maxZoom: 18,
    id: 'mapbox/streets-v11',
    accessToken: 'pk.eyJ1IjoiYWQyNyIsImEiOiJja3AxOXBydHQxMmM3MnBueHVvaGU4ZmgzIn0.3jf6Xgh0Un16ewd1evYR5Q'
}).addTo(mymap);



L.popup({
    autoClose :false,
    closeOnEscapeKey:false,
    closeOnClick : false,
    closeButton :false
})
    .setLatLng([59.7666666,22.95 ])
    .setContent('<p>HANKO RUSSARO<br/>T ( 27.2 , -25.6 )<br/>w( 43.2 , 0.0 , 3.893 )</p>')
    .openOn(mymap);
L.popup({
    autoClose :false,
    closeOnEscapeKey:false,
    closeOnClick : false,
    closeButton :false
})
    .setLatLng([69.1, 27.217])
    .setContent('<p>KAAMANEN<br/>T ( 28.3 , -37.8 )<br/>w( 34.0 , 0.0 , 6.203 )</p>')
    .openOn(mymap);
L.popup({
    autoClose :false,
    closeOnEscapeKey:false,
    closeOnClick : false,
    closeButton :false
})
    .setLatLng([64.3333333, 23.45])
    .setContent('<p>KALAJOKI ULKOKALLA<br/>T ( 23.9 , -26.1 )<br/>w( 27.8 , 0.0 , 8.325 )</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 63.00715, 27.797756])
    .setContent('<p>KUOPIO<br/>T(29.4 ,-35.0)<br/>w(26.2, 0.0, 1.54)</p>')
    .openOn(mymap);
L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 65.987575, 29.239381 ])
    .setContent('<p>KUUSAMO<br/>T (26.1 , -35.0)<br/>w(27.8, 0.0, 4.513)</p>')
    .openOn(mymap);
L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 64.930061, 25.354564 ])
    .setContent('<p>OULU<br/>T (28.3 , -30.6)<br/>w(12.9 , 0.0 , 3.073)</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 60.1166666, 21.7 ])
    .setContent('<p>PARAINEN FAGERHOLM<br/>T (27.8 , -24.4)<br/>w(29.8 , 0.0 , 7.212)</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 59.7833333, 21.3666666 ])
    .setContent('<p>PARAINEN UTO<br/>T (29.4 , -13.3)<br/>w(29.8 , 0.0 , 8.799)</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 61.183, 22.617 ])
    .setContent('<p>RAIJALA<br/>T (30.6 , -32.8)<br/>w(20.1 , 0.0 , 4.378)</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 61.414147,23.604392 ])
    .setContent('<p>TAMPERE PIRKKALA<br/>T (29.4 , -30.0)<br/>w(26.2 , 0.0 , 5.04)</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 60.514142,22.262808 ])
    .setContent('<p>TURKU<br/>T (31.7 , -26.1)<br/>w(26.8 , 0.0 , 5.143)</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 62.183, 30.683 ])
    .setContent('<p>VYARTSILYA<br/>T (30.6 , -33.3)<br/>w(26.2 , 0.0 , 3.336)</p>')
    .openOn(mymap);

L.popup({
        autoClose :false,
        closeOnEscapeKey:false,
        closeOnClick : false,
        closeButton :false
    })
    .setLatLng([ 60.7166666,28.7333333 ])
    .setContent('<p>VYBORG<br/>T (29.4 , -33.3)<br/>w(19.0 , 0.0 , 3.912)</p>')
    .openOn(mymap);

