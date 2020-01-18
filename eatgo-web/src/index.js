(async () => {
    const url = 'http://localhost:8080/restaurants';
    const responce = await fetch(url);
    const restaurants = await responce.json();

    const element = document.getElementById('app');
    element.innerHTML = `
        ${restaurants.map(restaurant => `
            <p>
                ${restaurant.id}
                ${restaurant.name}
                ${restaurant.address}
            </p>
        `).join('')}
    `;
})();