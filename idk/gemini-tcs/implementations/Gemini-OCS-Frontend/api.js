const API_URL = 'http://35.240.144.217:8080/api'

async function createSciencePlan(sp) {
    return await fetch(`${API_URL}/create`, {
        method: 'POST',
        headers: {
          'Content-type': 'application/json; charset=UTF-8'
        },
        body: JSON.stringify(sp)
    })
}

async function getSciencePlans() {
    return await fetch(`${API_URL}/getplan`)
        .then(res => res.json())
        .then(data => data)
}

async function testSciencePlan(sp_id) {
    return await fetch(`${API_URL}/test/${sp_id}`, {
        method: 'POST'
    })
}

async function submitSciencePlan(sp_id) {
    return await fetch(`${API_URL}/submit/${sp_id}`, {
        method: 'POST'
    })
}

