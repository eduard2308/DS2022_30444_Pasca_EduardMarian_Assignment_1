import { BASE_URL, HTTP } from "../http";

export default {
  login(data) {
    return HTTP.post(BASE_URL + "/login", data).then((response) => {
      if (response.data.token) {
        localStorage.setItem("user", JSON.stringify(response.data));
      }
      console.log(response.data);
      return response.data;
    });
  },

  logout() {
    localStorage.removeItem("user");
  },

  register(data) {
    return HTTP.post(BASE_URL + "/auth/sign-up", data);
  },
};
